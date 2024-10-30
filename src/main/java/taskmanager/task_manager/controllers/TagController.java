package taskmanager.task_manager.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import taskmanager.task_manager.entities.Tag;
import taskmanager.task_manager.services.TagService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/tag")
public class TagController {
    @Autowired
    private TagService tagService;

    @PostMapping("/comment")
    public Tag saveTag(@RequestBody Tag tag) {
        return tagService.saveTag(tag);
    }
    @GetMapping("/tags")
    public List<Tag> getTags() {
        return tagService.getTags();
    }

    @DeleteMapping("{id}")
    public void deleteTag(@PathVariable Long id) {
        tagService.deleteTag(id);
    }
    @PutMapping("/update/{id}")
    public Tag updateTag(@RequestBody Tag tag) {
        return tagService.updateTag(tag);
    }


}


