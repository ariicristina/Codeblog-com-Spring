package com.spring.codeblog.utils;

import com.spring.codeblog.model.Post;
import com.spring.codeblog.repository.CodeblogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class DummyData {

    @Autowired
    CodeblogRepository codeblogRepository;

    //@PostConstruct
    public void savePosts(){

        List<Post> postList = new ArrayList<>();
        Post post1 = new Post();
        post1.setAutor("Ariel Cristina");
        post1.setData(LocalDate.now());
        post1.setTitulo("Aprendendo Java de uma vez por todas");
        post1.setTexto("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");

        Post post2 = new Post();
        post2.setAutor("Ariel Cristina");
        post2.setData(LocalDate.now());
        post2.setTitulo("Agora vai com Spring");
        post2.setTexto("Vestibulum rhoncus est pellentesque elit. In arcu cursus euismod quis viverra nibh. Ultricies mi eget mauris pharetra et ultrices neque ornare. Vestibulum mattis ullamcorper velit sed ullamcorper. Sed risus pretium quam vulputate dignissim suspendisse in est. Vel turpis nunc eget lorem. Semper eget duis at tellus at urna condimentum mattis pellentesque. Ullamcorper sit amet risus nullam eget felis eget. ");

        postList.add(post1);
        postList.add(post2);

        for(Post post: postList){
            Post postSaved = codeblogRepository.save(post);
            System.out.println(postSaved.getId());
        }

    }
}
