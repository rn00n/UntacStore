package com.untacstore.modules.review;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
public interface ReplyRepository extends JpaRepository<Reply, Long> {
}