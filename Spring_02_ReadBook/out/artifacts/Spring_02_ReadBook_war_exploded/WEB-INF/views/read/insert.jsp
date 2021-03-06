<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<form class="readbook_write" method="post">
    <fieldset>
        <legend>독서록 작성</legend>
        <div class="input">
            <input placeholder="ISBN" name="isbn"/>
            <input placeholder="도서명" name="title"/>
        </div>
        <div class="input">
            <label>읽은날짜:</label><input type="date" name="sdate"/>
            <label>읽기시작:</label><input type="time" name="stime"/>
            <label>읽기마침:</label><input type="time" name="etime"/>
        </div>
        <div class="input">
            <input placeholder="생각 중독은 깊은 생각에 빠져 주위를 어쩌구..." name="subject">
        </div>
        <div class="input">
            <input placeholder="내용을 입력하세요" name="content">
        </div>
        <div class="input btn_box right">
            <button type="submit" class="save">SAVE</button>
            <button type="reset" class="reset">RESET</button>
            <button type="button" class="list">LIST</button>
        </div>
    </fieldset>
</form>