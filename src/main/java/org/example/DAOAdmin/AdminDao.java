package org.example.DAOAdmin;

import org.example.modele.Admin;
import org.example.DAOAdmin.DAO;

import java.util.List;
import java.util.Optional;

public class AdminDao  implements DAO<Admin> {


    @Override
    public Optional<Admin> get(long id) {
        return Optional.empty();
    }

    @Override
    public List<Admin> getAll() {
        return null;
    }

    @Override
    public void save(Admin admin) {

    }

    @Override
    public void update(Admin admin, String[] params) {

    }

    @Override
    public void delete(Admin admin) {

    }
}
