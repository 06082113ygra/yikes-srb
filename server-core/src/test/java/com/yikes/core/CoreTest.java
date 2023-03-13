package com.yikes.core;

import cn.hutool.json.JSONUtil;
import com.yikes.common.utils.CoreUtils;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

/**
 * <pre>
 *
 * </pre>
 *
 * @author guanrong.yin
 * @date 2023/3/12 19:14
 */
@SpringBootTest
public class CoreTest {

    @Test
    public void testTree() {
        User zs = new User(1L, "zs", null);
        User ls = new User(2L, "ls", 1L);
        User ww = new User(3L, "ww", null);
        User zl = new User(4L, "zl", 3L);
        User tq = new User(5L, "tq", 2L);
        User xx = new User(6L, "xx", 5L);
        User yy = new User(7L, "yy", 5L);

        List<User> users = Arrays.asList(zs,ls,ww,zl,tq, xx, yy);
        List<User> tree = CoreUtils.toTree(users, it -> it.getPid() == null,
                User::getId,
                User::getPid,
                User::setChild);
        System.out.println(JSONUtil.toJsonStr(tree));
    }


    @Data
    @NoArgsConstructor
    public final static class User{

        private Long id;

        private String username;

        private Long pid;

        private List<User> child;

        public User(Long id, String username, Long pid) {
            this.id = id;
            this.username = username;
            this.pid = pid;
        }
    }
}
