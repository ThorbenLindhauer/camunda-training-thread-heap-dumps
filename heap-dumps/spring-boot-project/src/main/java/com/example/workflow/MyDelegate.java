package com.example.workflow;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.commons.utils.IoUtil;
import org.springframework.context.annotation.Configuration;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class MyDelegate implements JavaDelegate {

  protected static final List<byte[]> FILES = new ArrayList<>();

  @Override
  public void execute(DelegateExecution delegateExecution) {
    byte[] file = IoUtil.inputStreamAsByteArray((InputStream) delegateExecution.getVariable("file"));
    FILES.add(file);
  }

}
