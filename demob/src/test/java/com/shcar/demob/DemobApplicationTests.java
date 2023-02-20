package com.shcar.demob;

import com.shcar.demob.mapper.SellingMapper;
import com.shcar.demob.mapper.UserMapper;
import com.shcar.demob.pojo.User;
import com.shcar.demob.pojo.Selling;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;

@SpringBootTest
class DemobApplicationTests {

    @Autowired
    DataSource dataSource;

    @Autowired
    UserMapper userMapper;

    @Autowired
    SellingMapper sellingMapper;

    @Test
    void contextLoads() {
    }

    @Test
    void mpTest() throws SQLException {
        List<User> userList = userMapper.selectList(null);
        for (User user: userList) {
            System.out.println(user);
        }
//        System.out.println(dataSource.getConnection());
    }

    @Test
    void sellingTest() throws SQLException {
        List<Selling> sellingMapperList = sellingMapper.selectList(null);

        sellingMapperList.forEach(System.out::println);
    }

}
