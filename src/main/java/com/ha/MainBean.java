package com.ha;

import java.io.Serializable;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.primefaces.context.RequestContext;
import org.primefaces.event.FileUploadEvent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hatemalimam
 */
@ManagedBean
@ViewScoped
public class MainBean implements Serializable {
    public void handleFileUpload(FileUploadEvent event) {
        FacesContext context = FacesContext.getCurrentInstance();
        Map map = context.getExternalContext().getRequestParameterMap();
        
        RequestContext.getCurrentInstance().execute("$('#result').append('"+ "<li> File Name: <span class=\"semi-bold\">" + event.getFile().getFileName() +"</span></li>')");       
    }
}
