package tsg.objects;

import java.util.ArrayList;
import java.util.List;

public class TestPlanObj {
    public String Category;
    public Integer Count;
    public Boolean[] TestDetail;
    public List<TestPlanObj> Children;

    public String getCategory(){
        return this.Category;
    }
    public Integer getCount(){
        return this.Count;
    }
    public Boolean[] getTestDetail(){
        return this.TestDetail;
    }
    public List<TestPlanObj> getChildren(){
        return this.Children;
    }

    public void setCategory(String c){
        this.Category = c;
    }
    public void setCount(Integer c){
        this.Count = c;
    }
    public void setTestDetail(Boolean[] b){
        this.TestDetail = b;
    }

    public void clearChildren(){
        this.Children.clear();
    }
    public void addChildren(TestPlanObj obj){
        if(this.Children == null){
            this.Children = new ArrayList<TestPlanObj>();
            this.Children.add(obj);
        }
    }
}
