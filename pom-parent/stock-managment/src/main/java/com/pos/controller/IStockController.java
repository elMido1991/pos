package com.pos.controller;

import com.pos.service.IEntrepotService;
import com.pos.service.ILocalisationService;
import com.pos.service.IStockService;

public interface IStockController extends IEntrepotService,IStockService,ILocalisationService {

}
