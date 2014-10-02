package github.kami.jira.webwork;

import com.atlassian.jira.issue.Issue;
import com.atlassian.jira.issue.IssueManager;
import com.atlassian.jira.issue.comments.Comment;
import com.atlassian.jira.issue.comments.CommentManager;
import com.atlassian.jira.user.util.UserManager;
import com.atlassian.jira.web.action.JiraWebActionSupport;

public class DummyAction extends JiraWebActionSupport {
    private final IssueManager issueManager;
    private final CommentManager commentManager;
    private final UserManager userManager;

    public DummyAction(final IssueManager issueManager, final CommentManager commentManager, final UserManager userManager) {
        this.issueManager = issueManager;
        this.commentManager = commentManager;
        this.userManager = userManager;
    }

    @Override
    public String doExecute() {
        String issueKey = getHttpRequest().getParameter("issueKey");
        String userName = getHttpRequest().getParameter("userName");
        String message = getHttpRequest().getParameter("message");

        if (issueKey != null && userName != null && message != null) {
            Issue issue = issueManager.getIssueObject(issueKey);
            Comment comment = commentManager.create(issue, userManager.getUserByKey(userName), message, false);
            commentManager.update(comment, false);
        }

        return "success";
    }
}
