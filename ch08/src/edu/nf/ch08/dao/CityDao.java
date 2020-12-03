package edu.nf.ch08.dao;

import edu.nf.ch08.entity.City;
import edu.nf.ch08.entity.PageBean;
import edu.nf.ch08.util.ConnUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author wangl
 * @date 2020/10/22
 */
public class CityDao {

    /**
     * 查询分页数据
     * @param pageBean
     * @return
     */
    public List<City> listCity(PageBean pageBean){
        String sql = "select city_id, city_name, city_code, province from city_info limit ?,?";
        List<City> list = new ArrayList<>();
        try(Connection conn = ConnUtils.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setInt(1, pageBean.getRowNum());
            ps.setInt(2, pageBean.getPageSize());
            try(ResultSet rs = ps.executeQuery()) {
                while(rs.next()){
                    City city = new City();
                    city.setId(rs.getInt(1));
                    city.setCityName(rs.getString(2));
                    city.setCityCode(rs.getString(3));
                    city.setProvince(rs.getString(4));
                    list.add(city);
                }
            }catch(SQLException e){
                throw e;
            }
        }catch(SQLException e){
            e.printStackTrace();
            throw new RuntimeException("查询异常", e);
        }
        return list;
    }

    /**
     * 获取总记录数
     * @return
     */
    public int getRowCount(){
        String sql = "select count(*) from city_info";
        try(Connection conn = ConnUtils.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery()){
            int rowCount = 0;
            if(rs.next()){
                rowCount = rs.getInt(1);
            }
            return rowCount;
        }catch(SQLException e){
            e.printStackTrace();
            throw new RuntimeException("查询异常", e);
        }
    }
}
