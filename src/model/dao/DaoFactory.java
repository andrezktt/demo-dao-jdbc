package model.dao;

import db.DB;
import model.dao.impl.DepartmentDaoJDBC;
import model.dao.impl.SellerDaoJDBC;

public interface DaoFactory {
    static SellerDao createSellerDao() {
        return new SellerDaoJDBC(DB.getConnection());
    }
    static DepartmentDao createDepartmentDao() {
        return new DepartmentDaoJDBC(DB.getConnection());
    }
}
