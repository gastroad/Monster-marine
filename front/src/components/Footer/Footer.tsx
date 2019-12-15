import React from "react"

const Header = () => {
  return (
    <footer
      style={{
        width: "100%",
        textAlign: "center",
        marginTop: "60px"
      }}
    >
      <div
        style={{
          padding: "30px 0 30px 0",
          borderBottom: "1px solid #c0c0c0",
          background: "#f7f7f7",
          borderTop: "1px solid #dfdfdf"
        }}
      ></div>
      <div
        style={{
          position: "relative",
          width: "1200px",
          margin: "0 auto",
          padding: "0 0 20px",
          overflow: "hidden"
        }}
      >
        <div>
          <p style={{ lineHeight: "18px", color: "#9e9e9e", fontSize: "11px" }}>
            상호명 : 보트코리아 | 대표 : 윤주혁 <br />
            사업자등록번호 :206-19-41450 | 통신판매 : 2010-서울광진-0588호 |
            전화 : 031-555-0124 <br /> 팩스 : 031-555-0129 | 메일:
            boatkorea@boat-korea.com | 서울사무소 : 서울특별시 광진구
            긴고랑로20길 51 보트코리아 <br /> 개인정보관리자 : asd | 전시장 :
            경기도 남양주시 수석동 254번지 보트코리아 <br /> 전화 : 031-555-0124
            | 팩스 : 031-555-0129 <br /> 전곡항 전시장 : 경기도 화성시 서신면
            전곡리 630-237 보트코리아 <br /> 전화 : 031-356-6091 | 팩스 :
            031-356-6075 copyright ⓒ www.boat-korea.com all right reserved{" "}
            <br />
          </p>
        </div>
      </div>
    </footer>
  )
}
export default Header
