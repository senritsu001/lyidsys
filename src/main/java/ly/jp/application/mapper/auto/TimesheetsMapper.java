package ly.jp.application.mapper.auto;

import java.util.List;
import ly.jp.application.model.entity.Timesheets;
import ly.jp.application.model.entity.TimesheetsExample;
import org.apache.ibatis.annotations.Param;

public interface TimesheetsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.timeSheets
     *
     * @mbggenerated Sun May 09 19:28:04 JST 2021
     */
    int countByExample(TimesheetsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.timeSheets
     *
     * @mbggenerated Sun May 09 19:28:04 JST 2021
     */
    int deleteByExample(TimesheetsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.timeSheets
     *
     * @mbggenerated Sun May 09 19:28:04 JST 2021
     */
    int insert(Timesheets record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.timeSheets
     *
     * @mbggenerated Sun May 09 19:28:04 JST 2021
     */
    int insertSelective(Timesheets record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.timeSheets
     *
     * @mbggenerated Sun May 09 19:28:04 JST 2021
     */
    List<Timesheets> selectByExample(TimesheetsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.timeSheets
     *
     * @mbggenerated Sun May 09 19:28:04 JST 2021
     */
    int updateByExampleSelective(@Param("record") Timesheets record, @Param("example") TimesheetsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.timeSheets
     *
     * @mbggenerated Sun May 09 19:28:04 JST 2021
     */
    int updateByExample(@Param("record") Timesheets record, @Param("example") TimesheetsExample example);
}