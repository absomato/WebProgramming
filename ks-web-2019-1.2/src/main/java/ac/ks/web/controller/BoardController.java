package ac.ks.web.controller;

import ac.ks.web.domain.Board;
import ac.ks.web.repository.BoardRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class BoardController {
    //url
    //method

    private BoardRepository boardRepository;

    public BoardController(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    @GetMapping("")
    public String home(){
        return "home";
    }

    @GetMapping("/board")
    public List<String> board(){

        List<String> boardList=new ArrayList<>();

        for(Board s : boardRepository.findAll()){
            boardList.add(s.getTitle());
        }


        //거르고 모으고
//        boardRepository.findAll().stream()
//               // 이거부터 먼저 생각하고 줄일수 있겠다 하고 밑으로 한다. .map(board -> board.getTitle())
//                .map(Board::getTitle)
//                .collect(Collectors.toCollection());


        return boardList;
    }
}
