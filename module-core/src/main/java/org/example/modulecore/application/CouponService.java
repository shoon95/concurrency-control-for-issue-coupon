package org.example.modulecore.application;

import lombok.RequiredArgsConstructor;
import org.example.modulecore.infrastructure.CouponRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CouponService {

    private final CouponRepository couponRepository;

    public void createCoupon(String name, int quantity) {

    }
}
