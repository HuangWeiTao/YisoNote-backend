package YisoNote.common.view;

import java.util.List;

/**
 * Created by Ken on 2016/9/9.
 */
public class Pager<T> {
     private int pageSize;
    private int currentPage;
    //private int totalPage;
    //private int totalItem;
    private List<T> currentItems;

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

//    public int getTotalPage() {
//        return totalPage;
//    }
//
//    public void setTotalPage(int totalPage) {
//        this.totalPage = totalPage;
//    }
//
//    public int getTotalItem() {
//        return totalItem;
//    }
//
//    public void setTotalItem(int totalItem) {
//        this.totalItem = totalItem;
//    }

    public List<T> getCurrentItems() {
        return currentItems;
    }

    public void setCurrentItems(List<T> currentItems) {
        this.currentItems = currentItems;
    }
}
