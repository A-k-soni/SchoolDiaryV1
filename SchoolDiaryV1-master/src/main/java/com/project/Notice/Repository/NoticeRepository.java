package com.project.Notice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project.Notice.dto.Notice_Table;





public interface NoticeRepository extends JpaRepository<Notice_Table,Integer> {

//	@Query(value="select * from Notice_table ",nativeQuery = true)
//	public List<Notice_Table> GlobalNotice();
//

    @Query(value="select * from Notice_table where student_class=?1",nativeQuery = true)
    public List<Notice_Table> ClassNotice(int student_class);


}
