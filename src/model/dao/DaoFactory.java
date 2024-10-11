package model.dao;

import model.dao.impl.SellerDaoJDBC;

public interface DaoFactory {
    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC();
    }
}
