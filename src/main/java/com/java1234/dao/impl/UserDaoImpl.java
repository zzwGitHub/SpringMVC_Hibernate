package com.java1234.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.java1234.dao.IUserDao;
import com.java1234.model.User;

@Repository
public class UserDaoImpl implements IUserDao{

//	private Class<?> entityClass;  
	protected SessionFactory sessionFactory;  
	      
//	public UserDaoImpl() {  
//        this.entityClass = null;  
//        Class<?> c = getClass();  
//        Type type = c.getGenericSuperclass();  
//        if (type instanceof ParameterizedType) {  
//            Type[] parameterizedType = ((ParameterizedType) type).getActualTypeArguments();  
//            this.entityClass = (Class<?>) parameterizedType[0];  
//        }  
//    }  
      
    @Resource  
    public void setSessionFactory(SessionFactory sessionFactory) {  
        this.sessionFactory = sessionFactory;  
    }  
  
    protected Session getSession() {  
        return sessionFactory.getCurrentSession();  
    }  
  
	@Override
	public void userAdd(User user) {
            
		getSession().save(user);
        
	}

}
