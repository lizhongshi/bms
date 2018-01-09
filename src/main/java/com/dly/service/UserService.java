package com.dly.service;

import com.dly.entity.Result;
import com.dly.entity.TAdmin;

public interface UserService {
	public  Result login(TAdmin user);
	public  Result register(TAdmin user);
}
