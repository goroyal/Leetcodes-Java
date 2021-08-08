import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/**
 * Given a string path, which is an absolute path (starting with a slash '/') to a file or directory in a Unix-style file system, convert it to the simplified canonical path. <br/>
 *
 * In a Unix-style file system, a period '.' refers to the current directory, a double period '..' refers to the directory up a level,
 * and any multiple consecutive slashes (i.e. '//') are treated as a single slash '/'.
 * For this problem, any other format of periods such as '...' are treated as file/directory names. <br/>
 * <br/>
 * The canonical path should have the following format: <br/>
 * <br/>
 * The path starts with a single slash '/'. <br/>
 * Any two directories are separated by a single slash '/'. <br/>
 * The path does not end with a trailing '/'. <br/>
 * The path only contains the directories on the path from the root directory to the target file or directory (i.e., no period '.' or double period '..') <br/>
 * Return the simplified canonical path. <br/>
 */
public class _071SimplifyPath {
  public String simplifyPath(String path) {
    if (path == null) {
      return null;
    }
    Deque<String> stack = new ArrayDeque<>();
    for (String token : path.split("/")) {
      if (token.length() == 0 || token.equals(".")) {
        continue;
      }
      if (token.equals("..")) {
        if (!stack.isEmpty()) {
          stack.pop();
        }
      } else {
        stack.push(token);
      }
    }
    StringBuilder builder = new StringBuilder();
    while (!stack.isEmpty()) {
      builder.append("/").append(stack.removeLast());
    }
    if (builder.length() > 0) {
      return builder.toString();
    }
    return "/";
  }
}
