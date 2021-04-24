package ua.com.nix.hometask;


public interface BaseTypeService<B extends BaseEntity> {
    void create(B b);
    B read(int id);
    void update(B b);
    void delete(int id);


}
