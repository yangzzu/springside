package cn.edu.zzu.tms.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import cn.edu.zzu.tms.entity.User;

public interface UserDao extends PagingAndSortingRepository<User, Long> {
	User findByLoginName(String loginName);
}
