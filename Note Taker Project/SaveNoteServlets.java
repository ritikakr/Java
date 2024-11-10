package com.servlets;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entities.Note;
import com.helper.FactoryProvider;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SaveNoteServlets extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public SaveNoteServlets() {
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		try {
			
			//title,content fetch
			String title = request.getParameter("title");
			String content = request.getParameter("content");
			
			Note note = new Note(title, content, new Date());
		//System.out.println(note.getId() + " : " + note.getTitle());
			 
			//hiberate:save()
			Session s = FactoryProvider.getFactory().openSession();	
			
			//to save our notes permanently 
			Transaction tx = s.beginTransaction();
			
			s.save(note);
			tx.commit();
			
			s.close();
			
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<h2 style='text-align:center; color:#00c853;'>Note addedd Successfully!!! </h2>");
			out.println("<h3 style='text-align:center;'><a href='all_notes.jsp'>View all notes</a></h3>");
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

}
