public interface Operations {
    public void save(Object data);
    public Object get(String ID);
    public void update (Object OLDdata, Object NEWdata);
    public void delete(String ID);
}
