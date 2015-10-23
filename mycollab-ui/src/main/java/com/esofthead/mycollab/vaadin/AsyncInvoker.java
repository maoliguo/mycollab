/**
 * This file is part of mycollab-ui.
 *
 * mycollab-ui is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * mycollab-ui is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with mycollab-ui.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.esofthead.mycollab.vaadin;

import com.esofthead.mycollab.configuration.SiteConfiguration;
import com.vaadin.ui.UI;

/**
 * @author MyCollab Ltd
 * @since 5.2.1
 */
public class AsyncInvoker {
    public static void access(final PageCommand pageCommand) {
        final UI ui = UI.getCurrent();
        pageCommand.setUI(ui);
        if (SiteConfiguration.getPullMethod() == SiteConfiguration.PullMethod.push) {
            new Thread() {
                @Override
                public void run() {
                    ui.access(new Runnable() {
                        @Override
                        public void run() {
                            try {
                                pageCommand.run();
                                ui.push();
                                pageCommand.postRun();
                            } finally {
                                pageCommand.cleanUp();
                                ui.push();
                            }
                        }
                    });
                }
            }.start();
        } else {
            ui.getSession().getLockInstance().lock();
            try {
                ui.setPollInterval(1000);
                pageCommand.run();
                pageCommand.postRun();
            } finally {
                pageCommand.cleanUp();
                ui.setPollInterval(-1);
                ui.getSession().getLockInstance().unlock();
            }
        }
    }

    public static abstract class PageCommand {
        UI currentUI;

        void setUI(UI ui) {
            currentUI = ui;
        }

        public UI getUI() {
            return currentUI;
        }

        abstract public void run();

        public void postRun() {
        }

        public void cleanUp() {
        }

        public void push() {
            if (SiteConfiguration.getPullMethod() == SiteConfiguration.PullMethod.push) {
                currentUI.push();
            }
        }
    }
}