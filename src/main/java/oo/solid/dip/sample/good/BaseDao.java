package oo.solid.dip.sample.good;

public interface BaseDao<T extends Object> {

    void save(T entidade);
}
