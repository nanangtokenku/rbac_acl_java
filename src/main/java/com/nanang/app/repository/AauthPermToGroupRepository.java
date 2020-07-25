package com.nanang.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nanang.app.entity.AauthPermToGroup;
import com.nanang.app.entity.AauthPermToGroupPK;
@Repository
public interface AauthPermToGroupRepository extends JpaRepository<AauthPermToGroup, AauthPermToGroupPK> {

}
