package ac.ks.web.controller;

import ac.ks.web.domain.Board;
import ac.ks.web.repository.BoardRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class BoardController {

    private BoardRepository boardRepository;

    public BoardController(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    @GetMapping("/")
    public String index(Model model){

        List<Board> boardList = boardRepository.findAll();
        //이게 뭐라고?
        model.addAttribute("boars",boardList);
        return "index";
    }
}
