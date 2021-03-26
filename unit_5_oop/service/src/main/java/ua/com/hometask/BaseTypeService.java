package ua.com.hometask;

import java.util.List;

public interface BaseTypeService<B extends BaseEntity> {
    void create(B b);
    void read(B b);
    void update(B b);
    void delete(int id);
    List<B> findAllByParameter(String param);
}
