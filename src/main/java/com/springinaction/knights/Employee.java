package com.springinaction.knights;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by liuyang11 on 2019/1/9.
 */
public class Employee {
    private Long id;
    private String name;
    private double salary;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    //原始的jdbc 获取数据
    public Employee getEmployeeById(long id) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = dataSource.getConnection();
            preparedStatement = connection.prepareStatement("select id, name, salary" +
                    " from employee where id=?");
            resultSet = preparedStatement.executeQuery();
            Employee employee = null;
            if(resultSet.next()){
                employee = new Employee();
                employee.setId(resultSet.getLong("id"));
                employee.setName(resultSet.getString("name"));
                employee.setSalary(resultSet.getDouble("salary"));
            }
            return employee;
        } catch (SQLException e) {
            //
            System.out.println(e);
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    System.out.println(e);
                }
            }
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    System.out.println(e);
                }
            }
            if(connection != null){
                try{
                    connection.close();
                }catch (SQLException e){
                    System.out.println(e);
                }
            }
        }
        return  null;
    }

    public Employee getEmployeeByIdWithTemplate(long id){
        return jdbcTemplate.queryForObject("select id, name, salary " +
                "from employee where id=?", new RowMapper<Employee>() {
            @Override
            public Employee mapRow(ResultSet resultSet, int i) throws SQLException {
                Employee employee = new Employee();
                employee.setId(resultSet.getLong("id"));
                employee.setName(resultSet.getString("name"));
                employee.setSalary(resultSet.getDouble("salary"));
                return employee;
            }
        }, id);
    }
}