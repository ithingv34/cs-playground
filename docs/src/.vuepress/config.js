const { description } = require('../../package')

module.exports = {
  base: '/cs-playground/',
  /**
   * Ref：https://v1.vuepress.vuejs.org/config/#title
   */
  title: 'Computer Science Playground',
  /**
   * Ref：https://v1.vuepress.vuejs.org/config/#description
   */
  description: description,

  /**
   * Extra tags to be injected to the page HTML `<head>`
   *
   * ref：https://v1.vuepress.vuejs.org/config/#head
   */
  head: [
    ['meta', { name: 'theme-color', content: '#3eaf7c' }],
    ['meta', { name: 'apple-mobile-web-app-capable', content: 'yes' }],
    ['meta', { name: 'apple-mobile-web-app-status-bar-style', content: 'black' }]
  ],

  /**
   * Theme configuration, here is the default theme configuration for VuePress.
   *
   * ref：https://v1.vuepress.vuejs.org/theme/default-theme-config.html
   */
  themeConfig: {
    repo: '',
    editLinks: false,
    docsDir: '',
    editLinkText: '',
    lastUpdated: false,
    nav: [
      {
        text: '자료구조',
        link: '/datastructure/',
      },
      {
        text: '운영체제',
        link: '/os/',
      },
      {
        text: '네트워크',
        link: '/network/',
      },
      {
        text: '데이터베이스',
        link: '/database/',
      },
      {
        text: '소프트웨어공학',
        link: '/software_engineering/',
      },
      {
        text: '시스템디자인',
        link: '/system_design/',
      },
      {
        text: 'Github',
        link: 'https://github.com/ithingv34/cs-playground'
      }
    ],
    sidebar: {
      '/datastructure/': [
        {
          title: '자료구조',
          collapsable: true,
          children: [
            '',
          ]
        },
        {
          title: '수학',
          collapsable: true,
          children: [
            {
              title: '집합',
              collapsable: true,
              children: [
                '/datastructure/Math/1_Set/',
              ]
            },
            {
              title: '경우의수',
              collapsable: true,
              children: [
                '/datastructure/Math/2_Number_of_cases/',
              ]
            },
            {
              title: '순열',
              collapsable: true,
              children: [
                '/datastructure/Math/3_Permutations/',
              ]
            },
            {
              title: '조합',
              collapsable: true,
              children: [
                '/datastructure/Math/4_Combination/',
              ]
            },
            {
              title: '지수와 로그',
              collapsable: true,
              children: [
                '/datastructure/Math/5_Exponential_log/',
              ]
            },
            {
              title: '재귀',
              collapsable: true,
              children: [
                '/datastructure/Math/6_Recursion/',
              ]
            },
            {
              title: '시간복잡도',
              collapsable: true,
              children: [
                '/datastructure/Math/7_Time_Complexity/',
              ]
            }

          ]
        },
        {
          title: '배열',
          collapsable: true,
          children: [
            '/datastructure/Array/'
          ]
        },
        {
          title: '연결리스트',
          collapsable: true,
          children: [
            '/datastructure/LinkedList/'
          ]
        },
        {
          title: '스택',
          collapsable: true,
          children: [
            '/datastructure/Stack/'
          ]
        },
        {
          title: '큐',
          collapsable: true,
          children: [
            '/datastructure/Queue/'
          ]
        },
        {
          title: '덱',
          collapsable: true,
          children: [
            '/datastructure/Deck/'
          ]
        },
        {
          title: '해시테이블',
          collapsable: true,
          children: [
            '/datastructure/HashTable/'
          ]
        },
        {
          title: '트리',
          collapsable: true,
          children: [
            '/datastructure/Tree/'
          ]
        },
        {
          title: '힙',
          collapsable: true,
          children: [
            '/datastructure/Heap/'
          ]
        },
        {
          title: '그래프',
          collapsable: true,
          children: [
            '/datastructure/Graph/'
          ]
        },
        {
          title: '트라이',
          collapsable: true,
          children: [
            '/datastructure/Trie/'
          ]
        },
      ],
    },
  },

  /**
   * Apply plugins，ref：https://v1.vuepress.vuejs.org/zh/plugin/
   */
  plugins: [
    '@vuepress/plugin-back-to-top',
    '@vuepress/plugin-medium-zoom',
  ]
}
