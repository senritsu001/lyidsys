package ly.jp.application.mapper.auto;

import java.util.List;
import ly.jp.application.model.entity.Testtbl;
import ly.jp.application.model.entity.TesttblExample;
import org.apache.ibatis.annotations.Param;

public interface TesttblMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.testTbl
     *
     * @mbggenerated Sun May 09 19:28:04 JST 2021
     */
    int countByExample(TesttblExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.testTbl
     *
     * @mbggenerated Sun May 09 19:28:04 JST 2021
     */
    int deleteByExample(TesttblExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.testTbl
     *
     * @mbggenerated Sun May 09 19:28:04 JST 2021
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.testTbl
     *
     * @mbggenerated Sun May 09 19:28:04 JST 2021
     */
    int insert(Testtbl record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.testTbl
     *
     * @mbggenerated Sun May 09 19:28:04 JST 2021
     */
    int insertSelective(Testtbl record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.testTbl
     *
     * @mbggenerated Sun May 09 19:28:04 JST 2021
     */
    List<Testtbl> selectByExample(TesttblExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.testTbl
     *
     * @mbggenerated Sun May 09 19:28:04 JST 2021
     */
    Testtbl selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.testTbl
     *
     * @mbggenerated Sun May 09 19:28:04 JST 2021
     */
    int updateByExampleSelective(@Param("record") Testtbl record, @Param("example") TesttblExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.testTbl
     *
     * @mbggenerated Sun May 09 19:28:04 JST 2021
     */
    int updateByExample(@Param("record") Testtbl record, @Param("example") TesttblExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.testTbl
     *
     * @mbggenerated Sun May 09 19:28:04 JST 2021
     */
    int updateByPrimaryKeySelective(Testtbl record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.testTbl
     *
     * @mbggenerated Sun May 09 19:28:04 JST 2021
     */
    int updateByPrimaryKey(Testtbl record);
}