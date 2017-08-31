package com.battle.framework.common.base;

/**
 * Service基类
 * Created by Bing.Z on 2017/7/20.
 */
public abstract class BaseService<D extends BaseDao, T> {
//    /**
//     * 持久层对象
//     */
//    @Autowired
//    protected D dao;
//
//    /**
//     * 插入数据
//     *
//     * @param entity
//     * @return
//     */
//    public int insert(T entity) {
//        return dao.insert(entity);
//    }
//    /**
//     * 插入数据
//     *
//     * @param map
//     */
//    public void insert(Map<String, Object> map) {
//        dao.insert(map);
//    }
//
//    /**
//     * 批量保存数据
//     *
//     * @param list
//     */
//    public void saveBatch(List<T> list) {
//        dao.saveBatch(list);
//    }
//
//    /**
//     * 更新数据
//     *
//     * @param t
//     * @return
//     */
//    public int update(T t) {
//        return dao.update(t);
//    }
//
//    /**
//     * 更新数据
//     *
//     * @param map
//     * @return
//     */
//    public int update(Map<String, Object> map) {
//        return dao.update(map);
//    }
//
//    /**
//     * 删除数据
//     *
//     * @param map
//     * @return
//     */
//    public int delete(Map<String, Object> map) {
//        return dao.delete(map);
//    }
//
//    /**
//     * 批量删除
//     *
//     * @param id
//     * @return
//     */
//    public int deleteBatch(Object[] id) {
//        return dao.deleteBatch(id);
//    }
//
//    /**
//     * 查询多条数据
//     *
//     * @param map
//     * @return
//     */
//    public List<T> findList(Map<String, Object> map) {
//        return dao.findList(map);
//    }
//
//    /**
//     * 统计数据总数
//     *
//     * @param map
//     * @return
//     */
//    public int queryTotal(Map<String, Object> map) {
//        return dao.queryTotal(map);
//    }
//
//    /**
//     * 统计数据总数
//     *
//     * @return
//     */
//    public int queryTotal() {
//        return dao.queryTotal();
//    }
//
//    /**
//     * 获取单条数据
//     *
//     * @param id
//     * @return
//     */
//    public T get(String id)
//    {
//        return (T) dao.get(id);
//    }
//
//
//    /**
//     * 获取单条数据
//     *
//     * @param entity
//     * @return
//     */
//    public T get(T entity){
//        return (T) dao.get(entity);
//    }
//
//    /**
//     * 查询数据列表，如果需要分页，请设置分页对象，如：entity.setPage(new Page<T>());
//     *
//     * @param entity
//     * @return
//     */
//    public List<T> findList(T entity){
//        return dao.findList(entity);
//    }
//
//    /**
//     * 查询所有数据列表
//     *
//     * @param entity
//     * @return
//     */
//    public List<T> findAllList(T entity){
//        return dao.findAllList(entity);
//    }
//
//    /**
//     * 删除数据（物理删除，从数据库中彻底删除）
//     * @param id
//     * @return
//     * @see int delete(T entity)
//     */
//    public int delete(String id){
//        return dao.delete(id);
//    }
//
//    /**
//     * 删除数据（物理删除，从数据库中彻底删除）
//     *
//     * @param entity
//     * @return
//     */
//    public int delete(T entity){
//        return dao.delete(entity);
//    }
//
//    /**
//     * 删除数据（逻辑删除，更新del_flag字段为1,在表包含字段del_flag时，可以调用此方法，将数据隐藏）
//     *
//     * @param entity
//     * @return
//     */
//    int deleteByLogic(T entity){
//        return dao.deleteByLogic(entity);
//    }
}
