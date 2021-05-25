package com.prueba.dao;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

public class GenericoDAOImpl{}

//@Repository
//public class GenericoDAOImpl extends HibernateDaoSupport implements GenericoDAO{
//
//	@Autowired
//	public GenericoDAOImpl(SessionFactory sessionFactory) {
//		super.setSessionFactory(sessionFactory);
//	}
//	
//	@Transactional
//	public <T> List<T> ejecutaSP(String pS_NomProcedimiento, Object[] pSA_Parametro) {
//		final Session session = getHibernateTemplate().getSessionFactory().getCurrentSession();
//		final Query query = session.createSQLQuery("SELECT * FROM "+pS_NomProcedimiento);
//		List<T> datos = agregarParametros(query, pSA_Parametro).list();
//		return datos;
//	}
//	
//	private Query agregarParametros(Query query, Object[] pTM_Parametro) {
//		int li_Contador = 0;
//		for (int i = 0; i < pTM_Parametro.length; i++) {
//
//			if (pTM_Parametro[i] instanceof Integer) {
//				query.setParameter(li_Contador, (Integer) pTM_Parametro[i]);
//			} else if (pTM_Parametro[i] instanceof Float) {
//				query.setParameter(li_Contador, (Float) pTM_Parametro[i]);
//			} else if (pTM_Parametro[i] instanceof Double) {
//				query.setParameter(li_Contador, (Double) pTM_Parametro[i]);
//			} else if (pTM_Parametro[i] instanceof String) {
//				query.setParameter(li_Contador, (String) pTM_Parametro[i]);
//			} else if (pTM_Parametro[i] instanceof Date) {
//				long time = ((Date) pTM_Parametro[i]).getTime();
//				query.setParameter(li_Contador, new java.sql.Date(time));
//			} else if (pTM_Parametro[i] instanceof BigDecimal) {
//				query.setParameter(li_Contador, (BigDecimal) pTM_Parametro[i]);
//			} else if (pTM_Parametro[i] instanceof Long) {
//				query.setParameter(li_Contador, (Long) pTM_Parametro[i]);
//			} else if (pTM_Parametro[i] instanceof Boolean) {
//				query.setParameter(li_Contador, (Boolean) pTM_Parametro[i]);
//			}
//			li_Contador++;
//		}
//		return query;
//	}
//
//}
