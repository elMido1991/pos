package com.pos.controller;

import com.pos.service.IEntrepotService;
import com.pos.service.ILocalisationService;
import com.pos.service.IStockService;

public interface IEntrepotController extends IEntrepotService,IStockService,ILocalisationService{
}
