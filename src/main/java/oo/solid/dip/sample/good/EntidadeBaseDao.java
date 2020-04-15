package oo.solid.dip.sample.good;

public interface EntidadeBaseDao<T extends Object> {

    void save(T entidade);
}
