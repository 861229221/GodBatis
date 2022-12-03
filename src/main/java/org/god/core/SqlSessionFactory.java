package org.god.core;

import java.util.Map;

/**
 * Created 12-03-2022  4:21 PM
 * Author  DIno
 */
public class SqlSessionFactory {
    private TransactionManager transactionManager;
    private Map<String, GodMappedStatement> mappedStatements;

    public TransactionManager getTransactionManager() {
        return transactionManager;
    }

    public void setTransactionManager(TransactionManager transactionManager) {
        this.transactionManager = transactionManager;
    }

    public Map<String, GodMappedStatement> getMappedStatements() {
        return mappedStatements;
    }

    public void setMappedStatements(Map<String, GodMappedStatement> mappedStatements) {
        this.mappedStatements = mappedStatements;
    }

    public SqlSessionFactory(TransactionManager transactionManager, Map<String, GodMappedStatement> mappedStatements) {
        this.transactionManager = transactionManager;
        this.mappedStatements = mappedStatements;
    }

    public SqlSession openSession(){
        transactionManager.openConnection();
        SqlSession sqlSession = new SqlSession(transactionManager, mappedStatements);
        return sqlSession;
    }
}
