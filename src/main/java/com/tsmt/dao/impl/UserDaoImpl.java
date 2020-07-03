package com.tsmt.dao.impl;

import com.tsmt.dao.UserDao;
import com.tsmt.domain.User;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {
    public void save(User user) {
        this.getHibernateTemplate().save(user);
    }
}
