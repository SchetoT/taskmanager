package taskmanager.task_manager.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import taskmanager.task_manager.entities.Tag;
import taskmanager.task_manager.repositories.TagRepository;

import java.util.List;
import java.util.Optional;
@Service
public class TagService {
    @Autowired
    private TagRepository tagRepository;

    public Tag saveTag(Tag tag){
        return tagRepository.save(tag);
    }
    public List<Tag> getTags(){
        return tagRepository.findAll();
    }
    public Optional<Tag> findById(Long id){
        return tagRepository.findById(id);
    }
    public Tag updateTag(Tag tag){
        return tagRepository.save(tag);
    }
    public void deleteTag(Long id){
        tagRepository.deleteById(id);
    }
}
