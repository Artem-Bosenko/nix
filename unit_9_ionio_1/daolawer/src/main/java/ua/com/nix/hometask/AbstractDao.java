package ua.com.nix.hometask;

import java.util.List;

public interface AbstractDao <T extends BaseEntity>{
    void create(T base);
    void update(T base);
    T read(int id);
    void delete(int id);
    List<T> findALl();
}
