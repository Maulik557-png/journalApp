package com.personal.journalApp.pojo;

import lombok.Data;

@Data
public class JournalEntry {

    private Long id;
    private String title;
    private String content;
}
