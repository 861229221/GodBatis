package org.god.core;

import java.sql.Connection;

/**
 * Created 12-03-2022  4:07 PM
 * Author  Dino
 */
public interface TransactionManager {
    /**
     * 提交事务
     */
    void commit();

    /**
     * 回滚事务
     */
    void rollback();

    /**
     * 关闭事务
     */
    void close();

    /**
     * 开启连接
     */
    void openConnection();

    /**
     * 获取连接对象
     * @return 连接对象
     */
    Connection getConnection();
}
