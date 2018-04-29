package cn.edu.tju.dao;


import cn.edu.tju.model.LoadInfo;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface LoadInfoRepo extends CrudRepository<LoadInfo, Integer>, PagingAndSortingRepository<LoadInfo, Integer> {

    public List<LoadInfo> findById(String ID, Pageable pageable);
    public int countById(String ID);
}
