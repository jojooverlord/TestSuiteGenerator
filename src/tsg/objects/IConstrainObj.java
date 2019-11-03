package tsg.objects;

public interface IConstrainObj {
    Boolean getIsPassed(Object obj, Boolean result);
    Object randomCase(Object obj, Boolean result);
    String randomObj(String[] list);
}
