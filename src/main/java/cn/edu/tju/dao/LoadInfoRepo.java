package cn.edu.tju.dao;


import cn.edu.tju.model.LoadInfo;
import org.springframework.boot.autoconfigure.elasticsearch.jest.JestProperties;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface LoadInfoRepo extends CrudRepository<LoadInfo, Integer>, PagingAndSortingRepository<LoadInfo, Integer> ,JpaRepository<LoadInfo,Integer> {

    public List<LoadInfo> findById(String ID, Pageable pageable);
    public List<LoadInfo> findByifcheck(Boolean c, Pageable pageable);
    public int countById(String ID);
    //@Query("select o from LoadInfo o where u.username like %?1%")
    public List<LoadInfo> findByNameContainingAndIfcheck(String Event,Boolean c,Pageable pageable);
    public int countByNameLike(String event);
}
