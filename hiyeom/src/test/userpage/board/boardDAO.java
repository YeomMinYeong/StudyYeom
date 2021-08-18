package test.userpage.board;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import test.userpage.board.boardDTO;

@Controller
public class boardDAO {

	@Autowired
	private boardDTO boardDTO = null;
	@Autowired
	private boardDAO boardDAO = null;
	@Autowired
	private SqlSessionTemplate  dao = null;

	
//	ID 확인 후 게시글 리스트를 불러옴
	@RequestMapping
	public String list(String pageNum, Model model, 
			HttpServletRequest request, boardDTO dto, userDTO userdto,  HttpSession session) {
		
		String id = (String)session.getAttribute("user_id");
		int pageSize = 10;
		
		if(pageNum==null) {
			pageNum="1";
		}
		int currentPage = Integer.parseInt(pageNum);
		int startRow = (currentPage-1)*pageSize+1;
		int endRow = currentPage*pageSize;
		int count = 0;
		int number = 0;
		
		List articleList = null;
		HashMap Row = new HashMap();
		Row.put("user_id", id);
		Row.put("startRow", startRow);
		Row.put("endRow", endRow);
		count = dao.selectOne("board.userGetArticleCount", id);
		
		if(count>0) {
			articleList = dao.selectList("board.userGetArticles", Row);
		}
		number = count-(currentPage-1)*pageSize;

		model.addAttribute("currentPage", currentPage);
		model.addAttribute("startRow", startRow);
		model.addAttribute("endRow", endRow);
		model.addAttribute("count", count);
		model.addAttribute("pageSize", pageSize);
		model.addAttribute("number", number);
		model.addAttribute("articleList", articleList);
		model.addAttribute("pageNum", pageNum);
		
		return "/userpage/oto/otoUserList.jsp";
	}
	
	@RequestMapping("content.do")
	public String content(int num, String pageNum, Model model) {
		
		return "/userpage/oto/otoContent.jsp";
	}
	
	
}
