package jdbc02.dao;

import java.util.List;

public interface DeptDao {
    void insertDept(Dept dept);
    List<Dept> findAllDept();
    void updateDept(Dept dept); //id에 해당하는 deptName 과 location 을 수정하는 메서드
    void deleteDept(Integer id);   //id에 해당하는 dept 삭제
}
