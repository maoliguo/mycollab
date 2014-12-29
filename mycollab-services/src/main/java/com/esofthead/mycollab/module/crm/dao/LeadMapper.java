/**
 * This file is part of mycollab-services.
 *
 * mycollab-services is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * mycollab-services is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with mycollab-services.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.esofthead.mycollab.module.crm.dao;

import com.esofthead.mycollab.core.persistence.ICrudGenericDAO;
import com.esofthead.mycollab.module.crm.domain.Lead;
import com.esofthead.mycollab.module.crm.domain.LeadExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@SuppressWarnings({ "ucd", "rawtypes" })
public interface LeadMapper extends ICrudGenericDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_lead
     *
     * @mbggenerated Mon Dec 29 09:23:24 ICT 2014
     */
    int countByExample(LeadExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_lead
     *
     * @mbggenerated Mon Dec 29 09:23:24 ICT 2014
     */
    int deleteByExample(LeadExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_lead
     *
     * @mbggenerated Mon Dec 29 09:23:24 ICT 2014
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_lead
     *
     * @mbggenerated Mon Dec 29 09:23:24 ICT 2014
     */
    int insert(Lead record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_lead
     *
     * @mbggenerated Mon Dec 29 09:23:24 ICT 2014
     */
    int insertSelective(Lead record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_lead
     *
     * @mbggenerated Mon Dec 29 09:23:24 ICT 2014
     */
    List<Lead> selectByExampleWithBLOBs(LeadExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_lead
     *
     * @mbggenerated Mon Dec 29 09:23:24 ICT 2014
     */
    List<Lead> selectByExample(LeadExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_lead
     *
     * @mbggenerated Mon Dec 29 09:23:24 ICT 2014
     */
    Lead selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_lead
     *
     * @mbggenerated Mon Dec 29 09:23:24 ICT 2014
     */
    int updateByExampleSelective(@Param("record") Lead record, @Param("example") LeadExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_lead
     *
     * @mbggenerated Mon Dec 29 09:23:24 ICT 2014
     */
    int updateByExampleWithBLOBs(@Param("record") Lead record, @Param("example") LeadExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_lead
     *
     * @mbggenerated Mon Dec 29 09:23:24 ICT 2014
     */
    int updateByExample(@Param("record") Lead record, @Param("example") LeadExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_lead
     *
     * @mbggenerated Mon Dec 29 09:23:24 ICT 2014
     */
    int updateByPrimaryKeySelective(Lead record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_lead
     *
     * @mbggenerated Mon Dec 29 09:23:24 ICT 2014
     */
    int updateByPrimaryKeyWithBLOBs(Lead record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_lead
     *
     * @mbggenerated Mon Dec 29 09:23:24 ICT 2014
     */
    int updateByPrimaryKey(Lead record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_lead
     *
     * @mbggenerated Mon Dec 29 09:23:24 ICT 2014
     */
    Integer insertAndReturnKey(Lead value);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_lead
     *
     * @mbggenerated Mon Dec 29 09:23:24 ICT 2014
     */
    void removeKeysWithSession(List primaryKeys);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_lead
     *
     * @mbggenerated Mon Dec 29 09:23:24 ICT 2014
     */
    void massUpdateWithSession(@Param("record") Lead record, @Param("primaryKeys") List primaryKeys);
}