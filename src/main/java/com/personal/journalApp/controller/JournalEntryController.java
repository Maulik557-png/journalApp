package com.personal.journalApp.controller;

import com.personal.journalApp.pojo.JournalEntry;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/api/journals")
public class JournalEntryController {

    private final Map<Long, JournalEntry> journalEntries = new HashMap<Long, JournalEntry>();

    @GetMapping
    public List<JournalEntry> getAllJournalEntry(){
        log.info("Getting all journalEntries");
        return new ArrayList<>(journalEntries.values());
    }

    @PostMapping("/{id}")
    public String getJournalById(@PathVariable long id){
        log.info("Getting journalEntry with id: {}", id);
        return journalEntries.get(id).getContent();
    }

    @PostMapping("/publish")
    public Long publishJournalEntry(@RequestBody JournalEntry journalEntry){
        log.info("Publishing journalEntry {}", journalEntry);

        journalEntries.put(journalEntry.getId(), journalEntry);
        log.info("JournalEntry with id {} has been added", journalEntry.getId());

        return journalEntry.getId();
    }
}
