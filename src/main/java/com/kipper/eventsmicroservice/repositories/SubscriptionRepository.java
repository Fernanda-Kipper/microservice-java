package com.kipper.eventsmicroservice.repositories;

import com.kipper.eventsmicroservice.domain.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {

}