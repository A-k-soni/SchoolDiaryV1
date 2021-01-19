package com.project.UserData_Login.repository;

import com.project.UserData_Login.dto.UserData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface userRepository extends JpaRepository <UserData , Integer > {

        @Query(value = "select * from user_data where email_id = ?1 and password = ?2",nativeQuery = true)
        public UserData loginE(String email , String password);

        @Query(value = "select * from user_data where mobile_no = ?1 and password = ?2",nativeQuery = true)
        public UserData loginM(String mobile, String password);

        @Transactional
        @Modifying
        @Query(value = "update user_data set password =?1 where email_id = ?2 and mobile_no = ?3 and security_q_a = ?5 and security_q_id = ?4",nativeQuery = true)
        public int updatePassword( String password ,String email,String mobile , String qId , String qA);


        public UserData findByuserId(String id);

}
